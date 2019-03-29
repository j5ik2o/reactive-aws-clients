// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RemoveTagsFromStreamRequest => ScalaRemoveTagsFromStreamRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{ RemoveTagsFromStreamRequest => JavaRemoveTagsFromStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RemoveTagsFromStreamRequestOps {

  implicit class ScalaRemoveTagsFromStreamRequestOps(val self: ScalaRemoveTagsFromStreamRequest) extends AnyVal {

    def toJava: JavaRemoveTagsFromStreamRequest = {
      val result = JavaRemoveTagsFromStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.tagKeys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.tagKeys(v.asJava)
      } // Seq[String]

      result.build()
    }

  }

}
