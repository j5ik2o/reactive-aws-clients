// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceRequest => ScalaTagResourceRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ TagResourceRequest => JavaTagResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TagResourceRequestOps {

  implicit class ScalaTagResourceRequestOps(val self: ScalaTagResourceRequest) extends AnyVal {

    def toJava: JavaTagResourceRequest = {
      val result = new JavaTagResourceRequest()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.withResourceArn(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.withTags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result
    }

  }

}
