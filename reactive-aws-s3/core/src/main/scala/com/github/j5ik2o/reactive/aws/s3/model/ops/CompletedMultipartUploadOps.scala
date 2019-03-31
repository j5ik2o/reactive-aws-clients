// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CompletedMultipartUpload => ScalaCompletedMultipartUpload, _ }
import software.amazon.awssdk.services.s3.model.{ CompletedMultipartUpload => JavaCompletedMultipartUpload }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CompletedMultipartUploadOps {

  implicit class ScalaCompletedMultipartUploadOps(val self: ScalaCompletedMultipartUpload) extends AnyVal {

    def toJava: JavaCompletedMultipartUpload = {
      val result = JavaCompletedMultipartUpload.builder()
      self.parts.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, CompletedPartOps._; result.parts(v.map(_.toJava).asJava)
      } // Seq[CompletedPart]

      result.build()
    }

  }

  implicit class JavaCompletedMultipartUploadOps(val self: JavaCompletedMultipartUpload) extends AnyVal {

    def toScala: ScalaCompletedMultipartUpload = {
      ScalaCompletedMultipartUpload()
        .withParts(Option(self.parts).map { v =>
          import scala.collection.JavaConverters._, CompletedPartOps._; v.asScala.map(_.toScala)
        }) // Seq[CompletedPart]
    }

  }

}
