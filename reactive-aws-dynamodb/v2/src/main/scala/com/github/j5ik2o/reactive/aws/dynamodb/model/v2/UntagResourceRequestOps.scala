package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceRequest => ScalaUntagResourceRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UntagResourceRequest => JavaUntagResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UntagResourceRequestOps {

  implicit class ScalaUntagResourceRequestOps(val self: ScalaUntagResourceRequest) extends AnyVal {

    def toJava: JavaUntagResourceRequest = {
      val result = JavaUntagResourceRequest.builder()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.resourceArn(v)) // String
      self.tagKeys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.tagKeys(v.asJava)
      } // Seq[String]

      result.build()
    }

  }

}
