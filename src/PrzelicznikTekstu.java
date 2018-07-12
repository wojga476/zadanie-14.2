import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrzelicznikTekstu {

    public int liczenieZnakowBezSpacji(String tekst) {
        int iloscSpacji = 0;
        Pattern p = Pattern.compile(" ");
        Matcher m = p.matcher(tekst);
        while (m.find()) {
            iloscSpacji++;
        }
        return tekst.length() - iloscSpacji;
    }

    public int liczenieWszystkichZnakow(String tekst) {
        return tekst.length();
    }

    public int liczenieSlow(String tekst) {
        char[] arraysample = tekst.toCharArray();
        int iloscSlow = 0;
        for (char c : arraysample) {
            if (c == ' ') {
                iloscSlow++;
            }
        }
        return iloscSlow + 1;
    }

    public boolean sprawdzanieCzyTekstJestPolidromem(String tekst) {
        char[] arraysample = tekst.toCharArray();
        int i = tekst.length();
        for (int j = 0; j < i; j++) {
            if (arraysample[j] != arraysample[i - j]) {
                return false;
            }
        }
        return true;
    }
}
