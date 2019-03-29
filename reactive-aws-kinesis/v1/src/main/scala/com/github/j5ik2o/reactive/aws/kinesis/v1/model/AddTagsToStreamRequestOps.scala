// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamRequest => ScalaAddTagsToStreamRequest, _ }
import com.amazonaws.services.kinesis.model.{ AddTagsToStreamRequest => JavaAddTagsToStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AddTagsToStreamRequestOps {

  implicit class ScalaAddTagsToStreamRequestOps(val self: ScalaAddTagsToStreamRequest) extends AnyVal {

    def toJava: JavaAddTagsToStreamRequest = {
      val result = new JavaAddTagsToStreamRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.tags.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withTags(v.asJava)
      } // Map[String, String]

      result
    }

  }

}
