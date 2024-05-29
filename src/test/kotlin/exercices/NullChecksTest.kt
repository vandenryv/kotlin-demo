package exercices

import org.example.donotchange.Car
import org.example.donotchange.Cylinder
import org.example.donotchange.Engine
import org.example.exercices.firstNonNull
import org.example.exercices.getCylinderSize
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NullChecksTest {

    @Test
    fun firstNonNull() {
        assertEquals(2, firstNonNull(2, 3, null))
        assertEquals(2, firstNonNull(null, 2, 3))
        assertTrue(null == firstNonNull(null, null, null))
    }

    @Test
    fun getCylinderSize() {
        val carEngine12 = Car(Engine(listOf(Cylinder(12.0F))))
        val carNoEngine = Car(null)
        val carEngineNoCylinder = Car(Engine(listOf()))

        assertEquals(null, getCylinderSize(carEngineNoCylinder))
        assertEquals(null, getCylinderSize(carNoEngine))
        assertEquals(12.0F, getCylinderSize(carEngine12))
    }

}