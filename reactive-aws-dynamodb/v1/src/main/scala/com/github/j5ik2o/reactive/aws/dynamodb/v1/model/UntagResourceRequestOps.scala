// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceRequest => ScalaUntagResourceRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ UntagResourceRequest => JavaUntagResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UntagResourceRequestOps {

  implicit class ScalaUntagResourceRequestOps(val self: ScalaUntagResourceRequest) extends AnyVal {

    def toJava: JavaUntagResourceRequest = {
      val result = new JavaUntagResourceRequest()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.withResourceArn(v)) // String
      self.tagKeys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withTagKeys(v.asJava)
      } // Seq[String]

      result
    }

  }

}
