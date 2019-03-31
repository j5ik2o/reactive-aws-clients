// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ TaggingDirective => ScalaTaggingDirective, _ }
import software.amazon.awssdk.services.s3.model.{ TaggingDirective => JavaTaggingDirective }

object TaggingDirectiveOps {

  implicit class ScalaTaggingDirectiveOps(val self: ScalaTaggingDirective) extends AnyVal {

    def toJava: JavaTaggingDirective = {
      JavaTaggingDirective.valueOf(self.entryName)
    }

  }

  implicit class JavaTaggingDirectiveOps(val self: JavaTaggingDirective) extends AnyVal {

    def toScala: ScalaTaggingDirective = {
      ScalaTaggingDirective.withName(self.toString)
    }

  }

}
