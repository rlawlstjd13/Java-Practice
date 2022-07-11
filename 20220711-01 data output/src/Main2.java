import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 { // DataOutputStream 이면 DataInputStream 받아야함 서로 서식이 똑같아야함.
	public static void main(String[] args) {
		DataOutputStream dos = null; // 원시형? // 파일이완성되면 사람이 읽을수업음.( 문자의 형태가아니라 byte단위라서);

		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\filetest\\mydata.dat"));

			dos.writeInt(50); // 인트형 자료를 인트로 출력
			dos.writeDouble(123.123); // 더블형 자료로 출력
			dos.writeUTF("문자열");

			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\mydata.dat")));

			int valueInt = dis.readInt();
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF();

			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // 데이타 인풋스트림 쓸떄 EOFEXception 해줘야함.
			System.out.println("파일 끝까지 다 읽음");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
