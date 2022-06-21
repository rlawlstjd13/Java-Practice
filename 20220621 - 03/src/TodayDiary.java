import java.nio.file.CopyOption;

public class TodayDiary implements Comparable<TodayDiary>{
private int date;
private String title;
private String weather;
private String contents;

public TodayDiary(int date, String title, String weather, String contents) {
	super();
	this.date = date;
	this.title = title;
	this.weather = weather;
	this.contents = contents;
}

public TodayDiary(int date) {
	super();
	this.date = date;
}

public int getDate() {
	return date;
}

public void setDate(int date) {
	this.date = date;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getWeather() {
	return weather;
}

public void setWeather(String weather) {
	this.weather = weather;
}

public String getContents() {
	return contents;
}

public void setContents(String contents) {
	this.contents = contents;
}

@Override
public String toString() {
	return "TodayDiary [date=" + date + ", title=" + title + ", weather=" + weather + ", contents=" + contents + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((contents == null) ? 0 : contents.hashCode());
	result = prime * result + date;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((weather == null) ? 0 : weather.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof TodayDiary))
		return false;
	TodayDiary other = (TodayDiary) obj;
	if (contents == null) {
		if (other.contents != null)
			return false;
	} else if (!contents.equals(other.contents))
		return false;
	if (date != other.date)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (weather == null) {
		if (other.weather != null)
			return false;
	} else if (!weather.equals(other.weather))
		return false;
	return true;
	
}
@Override
public int compareTo(TodayDiary o) {
	return o.date - o.date;
}

}
