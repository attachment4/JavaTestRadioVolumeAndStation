import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.qa.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFrom8To9() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFrom0To9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldPrev(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    // --- ТЕСТЫ ГРОМКОСТИ ---

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolumeFromNormal(){
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }
    @Test
    public void shouldInitWithCustomStationCount() {
        // Создаем радио на 30 станций (индексы от 0 до 29)
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);
        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldNextFromMaxStationToZero() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevFromZeroToMaxStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveCustomMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(30); // 30 нельзя, так как макс индекс 29
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
