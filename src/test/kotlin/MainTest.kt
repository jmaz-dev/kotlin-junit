import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun provocacao() {
//        O método precisa ser bem elaborado. Isso não está testando nada.
        Assertions.assertNotNull(countXO("xxoooo"))
        Assertions.assertNotNull(countXO("Asdssaxxx"))
        Assertions.assertNotNull(countXO("XxxxO"))
    }

    @Test
    @DisplayName("Teste método XXOO")
    fun testCountXO() {
//        afirmação
        Assertions.assertAll(
            { Assertions.assertEquals(countXO("xxoxoo"), true) },
            { Assertions.assertEquals(countXO("xxOo"), true) },
            { Assertions.assertEquals(countXO("XxOo"), true) },
            { Assertions.assertEquals(countXO("xXoo"), true) },
            { Assertions.assertEquals(countXO("xXoos"), false) },
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Esse teste precisa ser implementado")
    }

    @Test
    fun assumption() {
//        suposição
        Assumptions.assumeTrue(countXO("xxxoo"))
        Assertions.assertTrue(abc())

    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }
}
