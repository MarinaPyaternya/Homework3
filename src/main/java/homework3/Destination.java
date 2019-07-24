package homework3;

public class Destination {
    private String Name;
    private String Surname;
    private String SocialStatus;
    private long NumberPhone;

    public Destination() {
    }

    public Destination(String name, String surname, String socialStatus, long numberPhone) {
        this.Name = name;
        this.Surname = surname;
        this.SocialStatus = socialStatus;
        this.NumberPhone = numberPhone;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getSocialStatus() {
        return SocialStatus;
    }

    public long getNumberPhone() {
        return NumberPhone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setSocialStatus(String socialStatus) {
        SocialStatus = socialStatus;
    }

    public void setNumberPhone(long numberPhone) {
        NumberPhone = numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Destination that = (Destination) o;

        if (NumberPhone != that.NumberPhone) return false;
        if (!Name.equals(that.Name)) return false;
        if (!Surname.equals(that.Surname)) return false;
        return SocialStatus.equals(that.SocialStatus);
    }

    @Override
    public int hashCode() {
        int result = Name.hashCode();
        result = 31 * result + Surname.hashCode();
        result = 31 * result + SocialStatus.hashCode();
        result = 31 * result + (int) (NumberPhone ^ (NumberPhone >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", SocialStatus='" + SocialStatus + '\'' +
                ", NumberPhone=" + NumberPhone +
                '}';
    }
}
