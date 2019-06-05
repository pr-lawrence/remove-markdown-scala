package kr.pe.lawrence

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
    val result = """<a href="http://www.google.com">Google</a> ![image](http://www.google.com/image) [Facebook][http://www.facebook.com]""".replaceAll("<[^>]*>", "")
    Markdown.remove(result) should be("Google  Facebook")
  }

  "Markdown" should "remove2" in {
    val content = "## 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다.\n\n" +
    "## 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다.\n\n" +
    "## 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다.\n\n" +
    "## 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다.\n\n" +
      "- 1\n" +
      "- 2\n" +
      "- 3\n" +
      "- 4\n" +
      "\n" +
      "트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다. 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다. 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다. 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다. 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다. 트레이트는 자바에서 인터페이스와 같은 역할을 하는 스칼라의 키워드로 Trait로 선언한다.\n" +
      "\n" +
      "```scala\n" +
      "val a = 3\n" +
      "val b = 4\n" +
      "val sum = a + b\n" +
      "```\n" +
      "\n" +
      "blablabla"

      Console println Markdown.remove(content)
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