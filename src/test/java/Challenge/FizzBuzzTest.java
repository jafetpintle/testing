package Challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_dividedBy3_Fizz(){
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void fizzBuzz_dividedBy5_Buzz(){
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void fizzBuzz_dividedBy5And3_FizzBuzz(){
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void fizzBuzz_otherCase_number(){
        Assert.assertEquals("89", FizzBuzz.fizzBuzz(89));
        Assert.assertEquals("79", FizzBuzz.fizzBuzz(79));
    }

}