// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Tagging => ScalaTagging, _ }
import software.amazon.awssdk.services.s3.model.{ Tagging => JavaTagging }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TaggingOps {

  implicit class ScalaTaggingOps(val self: ScalaTagging) extends AnyVal {

    def toJava: JavaTagging = {
      val result = JavaTagging.builder()
      self.tagSet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tagSet(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

  implicit class JavaTaggingOps(val self: JavaTagging) extends AnyVal {

    def toScala: ScalaTagging = {
      ScalaTagging()
        .withTagSet(Option(self.tagSet).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
