// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ AccessControlPolicy => ScalaAccessControlPolicy, _ }
import software.amazon.awssdk.services.s3.model.{ AccessControlPolicy => JavaAccessControlPolicy }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AccessControlPolicyOps {

  implicit class ScalaAccessControlPolicyOps(val self: ScalaAccessControlPolicy) extends AnyVal {

    def toJava: JavaAccessControlPolicy = {
      val result = JavaAccessControlPolicy.builder()
      self.grants.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GrantOps._; result.grants(v.map(_.toJava).asJava)
      } // Seq[Grant]
      self.owner.foreach { v =>
        import OwnerOps._; result.owner(v.toJava)
      } // Owner

      result.build()
    }

  }

  implicit class JavaAccessControlPolicyOps(val self: JavaAccessControlPolicy) extends AnyVal {

    def toScala: ScalaAccessControlPolicy = {
      ScalaAccessControlPolicy()
        .withGrants(Option(self.grants).map { v =>
          import scala.collection.JavaConverters._, GrantOps._; v.asScala.map(_.toScala)
        }) // Seq[Grant]
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
    }

  }

}
