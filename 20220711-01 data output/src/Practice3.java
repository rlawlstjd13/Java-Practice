import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//
// 입력을 통한 (사람정보) 파일 기록
// 목록
// ==============
// 1명(번호로선택)
// 1명(수정)
// 1명(삭제)
class User implements Serializable {
	int number;
	String name;
	String phoneNumber;
	String email;

	public User(int number, String name, String phoneNumber, String email) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

}

public class Practice3 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		Scanner scan = new Scanner(System.in);

		List<User> list = new ArrayList<>();

		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\user.dat")));
			oos.writeObject(new User(1, "홍길동", "010-111-1111", "hong@hanmail.net"));
			oos.writeObject(new User(2, "김유신", "010-222-2222", "kim@hanmail.net"));

			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("d:\\filetest\\user.dat")));

			User u = (User) ois.readObject();
			User s = (User) ois.readObject();

			System.out.println(u.getNumber());
			System.out.println(s);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
