// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RemoveTagsFromStreamRequest => ScalaRemoveTagsFromStreamRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ RemoveTagsFromStreamRequest => JavaRemoveTagsFromStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RemoveTagsFromStreamRequestOps {

  implicit class ScalaRemoveTagsFromStreamRequestOps(val self: ScalaRemoveTagsFromStreamRequest) extends AnyVal {

    def toJava: JavaRemoveTagsFromStreamRequest = {
      val result = new JavaRemoveTagsFromStreamRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.tagKeys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withTagKeys(v.asJava)
      } // Seq[String]

      result
    }

  }

}
