import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void assessPassword_WeakPassord_WhenLessThanEightLetter(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("AB9!"));
    }

    @Test
    public void assessPassword_WeakPassord_WhenOnlyLetters(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("ABCasdDESA"));
    }

    @Test
    public void assessPassword_WeakPassord_WhenOnlyNumbers(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234456123213"));
    }

    @Test
    public void assessPassword_mediumPassord_WhenHasNumbers(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("ABCasdDESA123"));
    }

    @Test
    public void assessPassword_StrongPassord_WhenHasNumbersLettersNumbers(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("ABCasdDESA123!"));
    }

}
