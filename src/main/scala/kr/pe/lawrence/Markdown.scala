package kr.pe.lawrence

/**
  *
  * @author Lawrence
  * @since 2018. 10. 4.
  * @note
  * @version 0.0.1
  */
object Markdown {
  def remove(content: String): String = {

    // Remove horizontal rules (stripListHeaders conflict with this rule, which is why it has been moved to the top)
    var output = content.replaceAll("(?m)^(-\\s*?|\\*\\s*?|_\\s*?){3,}\\s*$", "")

    output = output.replaceAll("(?m)^([\\s\\t]*)([\\*\\-\\+]|\\d+\\.)\\s+", "$1")

    // Remove HTML tags
    output.replaceAll("<[^>]*>", "")
      // Remove setext-style headers
      .replaceAll("^[=\\-]{2,}\\s*$", "")
      // Remove footnotes?
      .replaceAll("\\[\\^.+?\\](\\: .*?$)?", "")
      .replaceAll("\\s{0,2}\\[.*?\\]: .*?$", "")
      // Remove images
      .replaceAll("\\!\\[(.*?)\\][\\[\\(].*?[\\]\\)]", "")
      // inline link
      .replaceAll("\\[(.*?)\\][\\[\\(].*?[\\]\\)]", "$1")
      // Remove blockquotes
      .replaceAll("^\\s{0,3}>\\s?", "")
      // Remove reference-style links?
      .replaceAll("^\\s{1,2}\\[(.*?)\\]: (\\S+)( \".*?\")?\\s*$", "")
      // Remove atx-style headers
      .replaceAll("(?m)^(\\n)?\\s{0,}#{1,6}\\s+| {0,}(\\n)?\\s{0,}#{0,} {0,}(\\n)?\\s{0,}$", "$1$2$3")
      // Remove emphasis (repeat the line to remove double emphasis)
      .replaceAll("([\\*_]{1,3})(\\S.*?\\S{0,1})\\1", "$2")
      .replaceAll("([\\*_]{1,3})(\\S.*?\\S{0,1})\\1", "$2")
      // Remove code blocks
      .replaceAll("(`{3,})(.*)", "")
      // Remove inline code
      .replaceAll("`(.+?)`", "$1")
      // Replace two or more newlines with exactly two? Not entirely sure this belongs here...
      .replaceAll("\\n{2,}", "\n\n")
  }
}
