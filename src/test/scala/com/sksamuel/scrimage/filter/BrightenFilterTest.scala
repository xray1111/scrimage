package com.sksamuel.scrimage.filter

import org.scalatest.{OneInstancePerTest, BeforeAndAfter, FunSuite}
import com.sksamuel.scrimage.Image

/** @author Stephen Samuel */
class BrightenFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

     val original = getClass.getResourceAsStream("/bird_small.png")
     val expected = getClass.getResourceAsStream("/bird_small_blur.png")

     test("blur output matches expected") {
         assert(Image(original).filter(BlurFilter) == Image(expected))
     }
 }