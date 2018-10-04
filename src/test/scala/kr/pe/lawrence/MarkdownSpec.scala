package kr.pe.lawrence

import collection.mutable.Stack
import org.scalatest._

/**
  *
  * @author Lawrence
  * @since 2018. 10. 4.
  * @note
  * @version 0.0.1
  */
class MarkdownSpec extends FlatSpec with Matchers {

  "Markdown" should "remove" in {
    val input = "## Hello world"
    Markdown.remove(input) should be("Hello world")
  }

  /*
    "A Stack" should "pop values in last-in-first-out order" in {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() should be(2)
      stack.pop() should be(1)
    }

    it should "throw NoSuchElementException if an empty stack is popped" in {
      val emptyStack = new Stack[Int]
      a[NoSuchElementException] should be thrownBy {
        emptyStack.pop()
      }
    }
  */
}