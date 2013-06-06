package com.sksamuel.scrimage.filter

import org.scalatest.{OneInstancePerTest, BeforeAndAfter, FunSuite}
import com.sksamuel.scrimage.Image
import java.io.File

/** @author Stephen Samuel */
class OffsetFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

    val original = Image(getClass.getResourceAsStream("/bird_small.png"))

    test("filter output matches expected") {
        original.filter(OffsetFilter(40, 60)).write(new File("src/test/resources/bird_small_offset.png"))
        val expected = getClass.getResourceAsStream("/bird_small_offset.png")
        assert(original.filter(OffsetFilter(40, 60)) === Image(expected))
    }
}