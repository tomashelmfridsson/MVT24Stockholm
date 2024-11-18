package solidus;

// Det finns en intern valuta ”solidus” som man kan göra uttag ifrån.
// Man kan såklart enbart göra så stort uttag som man har ”råd med”.
// Alla börjar med 5 solidus och när man blir gold member får man 20 solidus automatiskt.
// Användarna vill såklart kunna ta reda på hur många solidus de har.
// Varje gång man loggar in får man en solidus.
// Med solidus kan man köpa merch: hoodie kostar 20 solidus,
// t-shirt 15 solidus och stickers 5 solidus.
// Detta är en massa funktioner, utveckla dem därför med flera steg enligt TDD

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolidusTest {
    @Test
    public void seeMyDefaultSolidusTest() {
        Solidus solidus = new Solidus();
        assertEquals(5, solidus.getSolidus());
    }

    @Test
    public void loginTest(){
        Solidus solidus = new Solidus();
        solidus.login();
        assertEquals(6, solidus.getSolidus());
    }

    @Test
    public void withdrawSolidusTest(){
        Solidus solidus = new Solidus();
        solidus.withdraw(2);
        assertEquals(3, solidus.getSolidus());
    }

    @Test
    public void toBigWithdrawSolidusTest(){
        Solidus solidus = new Solidus();
        solidus.withdraw(7);
        assertEquals(5, solidus.getSolidus());
        assertEquals(false, solidus.withdraw(7));
    }

    @Test
    public void goldMemberTest(){
        Solidus solidus = new Solidus();
        solidus.goldMember();
        assertEquals(25, solidus.getSolidus());
    }

    @Test
    public void buyHoodieTest(){
        Solidus solidus = new Solidus();
        solidus.goldMember();
        solidus.buyHoodie();
        assertEquals(5, solidus.getSolidus());
    }

    @Test
    public void buyHoodieWithoutMoneyTest(){
        Solidus solidus = new Solidus();
        solidus.buyHoodie();
        assertEquals(5, solidus.getSolidus());
        assertEquals(false,solidus.buyHoodie());
    }

    @Test
    public void buyTshirtTest(){
        Solidus solidus = new Solidus();
        solidus.goldMember();
        solidus.buyTshirt();
        assertEquals(10, solidus.getSolidus());
    }

    @Test
    public void buyTshirtWithoutMoneyTest(){
        Solidus solidus = new Solidus();
        solidus.buyTshirt();
        assertEquals(5, solidus.getSolidus());
        assertEquals(false,solidus.buyTshirt());
    }

    @Test
    public void buyStickersTest(){
        Solidus solidus = new Solidus();
        solidus.buyStickers();
        assertEquals(0, solidus.getSolidus());
        assertEquals(false,solidus.buyStickers());
    }

}
