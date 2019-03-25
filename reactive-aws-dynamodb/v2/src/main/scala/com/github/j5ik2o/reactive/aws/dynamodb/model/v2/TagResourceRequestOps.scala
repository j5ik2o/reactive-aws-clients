package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceRequest => ScalaTagResourceRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TagResourceRequest => JavaTagResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TagResourceRequestOps {

  implicit class ScalaTagResourceRequestOps(val self: ScalaTagResourceRequest) extends AnyVal {

    def toJava: JavaTagResourceRequest = {
      val result = JavaTagResourceRequest.builder()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.resourceArn(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

}
