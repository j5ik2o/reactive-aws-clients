// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamRequest => ScalaAddTagsToStreamRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ AddTagsToStreamRequest => JavaAddTagsToStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AddTagsToStreamRequestOps {

  implicit class ScalaAddTagsToStreamRequestOps(val self: ScalaAddTagsToStreamRequest) extends AnyVal {

    def toJava: JavaAddTagsToStreamRequest = {
      val result = JavaAddTagsToStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.tags.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.tags(v.asJava)
      } // Map[String, String]

      result.build()
    }

  }

}
