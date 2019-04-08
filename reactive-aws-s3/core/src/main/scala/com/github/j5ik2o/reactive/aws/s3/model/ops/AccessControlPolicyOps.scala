// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AccessControlPolicyBuilderOps(val self: AccessControlPolicy.Builder) extends AnyVal {

  final def grantsAsScala(value: Option[Seq[Grant]]): AccessControlPolicy.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grants(v.asJava)
    } // Seq[Grant]
  }

  final def ownerAsScala(value: Option[Owner]): AccessControlPolicy.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

}

final class AccessControlPolicyOps(val self: AccessControlPolicy) extends AnyVal {

  final def grantsAsScala: Option[Seq[Grant]] = Option(self.grants).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Grant]

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccessControlPolicyOps {

  implicit def toAccessControlPolicyBuilderOps(v: AccessControlPolicy.Builder): AccessControlPolicyBuilderOps =
    new AccessControlPolicyBuilderOps(v)

  implicit def toAccessControlPolicyOps(v: AccessControlPolicy): AccessControlPolicyOps = new AccessControlPolicyOps(v)

}
