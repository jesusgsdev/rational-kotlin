package jesusgsdev.rationals

import org.junit.Assert
import org.junit.Test

class TestRationals {
    @Test
    fun test0() {
        val r1 = 1 divBy 2
        val r2 = 2000000000L divBy 4000000000L
        Assert.assertEquals("""Wrong result for
            |val r1 = 1 divBy 2
            |val r2 = 2000000000L divBy 4000000000L
            |r1 == r2""".trimMargin(),
                true, r1 == r2)
    }

    @Test
    fun test1() {
        Assert.assertEquals("Wrong result for\n(2 divBy 1).toString() == \"2\"",
                true, (2 divBy 1).toString() == "2")
    }

    @Test
    fun test2() {
        Assert.assertEquals("Wrong result for\n(-2 divBy 4).toString() == \"-1/2\"",
                true, (-2 divBy 4).toString() == "-1/2")
    }

    @Test
    fun test3() {
        Assert.assertEquals("Wrong result for\n\"117/1098\".toRational().toString() == \"13/122\"",
                true, "117/1098".toRational().toString() == "13/122")
    }

    @Test
    fun test4() {
        Assert.assertEquals("Wrong result for\n\"1/2\".toRational() - \"1/3\".toRational() == \"1/6\".toRational()",
                true, "1/2".toRational() - "1/3".toRational() == "1/6".toRational())
        Assert.assertEquals("Wrong result for\n\"1/2\".toRational() + \"1/3\".toRational() == \"5/6\".toRational()",
                true, "1/2".toRational() + "1/3".toRational() == "5/6".toRational())
    }

    @Test
    fun test5() {
        Assert.assertEquals("Wrong result for\n-(1 divBy 2) == (-1 divBy 2)",
                true, -(1 divBy 2) == (-1 divBy 2))
    }

    @Test
    fun test6() {
        Assert.assertEquals("Wrong result for\n(1 divBy 2) * (1 divBy 3) == \"1/6\".toRational()",
                true, (1 divBy 2) * (1 divBy 3) == "1/6".toRational())
        Assert.assertEquals("Wrong result for\n(1 divBy 2) / (1 divBy 4) == \"2\".toRational()",
                true, (1 divBy 2) / (1 divBy 4) == "2".toRational())
    }

    @Test
    fun test7() {
        Assert.assertEquals("Wrong result for\n(1 divBy 2) < (2 divBy 3)",
                true, (1 divBy 2) < (2 divBy 3))
        Assert.assertEquals("Wrong result for\n(1 divBy 2) in (1 divBy 3)..(2 divBy 3)",
                true, (1 divBy 2) in (1 divBy 3)..(2 divBy 3))
    }

    @Test
    fun test8() {
        Assert.assertEquals("Wrong result for\n" +
                "\"912016490186296920119201192141970416029\".toBigInteger() divBy " +
                "\"1824032980372593840238402384283940832058\".toBigInteger() == 1 divBy 2",
                true, "912016490186296920119201192141970416029".toBigInteger() divBy
                "1824032980372593840238402384283940832058".toBigInteger() == 1 divBy 2)
    }

    @Test
    fun test9() {
        Assert.assertEquals("Wrong result for\n(6 divBy 3).toString() == \"2\"",
                true, (6 divBy 3).toString() == "2")
    }

    @Test
    fun test10() {
        Assert.assertEquals("Wrong result for\n2.toRational() == \"2\"",
                true, "5670711258187766016096".toRational().toString() == "5670711258187766016096")
    }

    @Test
    fun test11() {
        Assert.assertEquals("Wrong result for\n\"-1/-2\".toRational().toString() == \"1/2\"",
                true, "-1/-2".toRational().toString() == "1/2")
    }

    @Test
    fun test12() {
        Assert.assertEquals("Wrong result for\n\"1/-2\".toRational().toString() == \"-1/2\"",
                true, "1/-2".toRational().toString() == "-1/2")
    }

    @Test
    fun test13() {
        Assert.assertEquals("Wrong result for\n\"-1/2\" == \"1/2\"",
                false, "1/2".toRational() == "-1/2".toRational())
    }

    @Test
    fun test14() {
        Assert.assertEquals("Wrong result for\n\"-1042438361047144366998/59812037109262381713\" == \"1076615241954175969826/-61773005685895342531\"",
                true, "-1042438361047144366998/59812037109262381713".toRational() == "1076615241954175969826/-61773005685895342531".toRational())
    }
}