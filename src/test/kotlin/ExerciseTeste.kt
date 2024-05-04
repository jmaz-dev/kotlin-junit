import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ExerciseTeste {

    @Test
    @DisplayName("Idade")
    fun testeIdadePortaria() {
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(14, "comum", "xt23"), "Negado.") },
            { Assertions.assertEquals(portaria(0, "comum", "xt23"), "Negado.") },
            { Assertions.assertEquals(portaria(-1, "comum", "xt23"), "Negado.") },
            { Assertions.assertEquals(portaria(9999, "comum", "xt23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "comum", "xt23"), "Welcome.") }
        )

    }

    @Test
    @DisplayName("Convite")
    fun testeConvitePortaria() {
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(18, "CoMum", "xt23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "PREMIUM", "xl23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "luXo", "xl23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "LUXP", "xl23"), "Negado.") },
            { Assertions.assertEquals(portaria(18, "", "xt23"), "Negado.") }
        )

    }

    @Test
    @DisplayName("Codigo")
    fun testeCodigoPortaria() {
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(18, "comum", "xl23"), "Negado.") },
            { Assertions.assertEquals(portaria(18, "comum", "XL23"), "Negado.") },
            { Assertions.assertEquals(portaria(18, "comum", "XTt23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "comum", "XT23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "luXo", "xll23"), "Welcome.") },
            { Assertions.assertEquals(portaria(18, "luXo", "XL23"), "Welcome.") }
        )

    }

}