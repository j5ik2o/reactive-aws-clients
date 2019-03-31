// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ MetadataDirective => ScalaMetadataDirective, _ }
import software.amazon.awssdk.services.s3.model.{ MetadataDirective => JavaMetadataDirective }

object MetadataDirectiveOps {

  implicit class ScalaMetadataDirectiveOps(val self: ScalaMetadataDirective) extends AnyVal {

    def toJava: JavaMetadataDirective = {
      JavaMetadataDirective.valueOf(self.entryName)
    }

  }

  implicit class JavaMetadataDirectiveOps(val self: JavaMetadataDirective) extends AnyVal {

    def toScala: ScalaMetadataDirective = {
      ScalaMetadataDirective.withName(self.toString)
    }

  }

}
