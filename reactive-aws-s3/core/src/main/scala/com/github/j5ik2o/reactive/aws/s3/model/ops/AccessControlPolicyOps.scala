// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AccessControlPolicyBuilderOps(val self: AccessControlPolicy.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala(value: Option[Seq[Grant]]): AccessControlPolicy.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grants(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): AccessControlPolicy.Builder = {
    value.fold(self) { v => self.owner(v) }
  }

}

final class AccessControlPolicyOps(val self: AccessControlPolicy) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala: Option[Seq[Grant]] =
    Option(self.grants).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccessControlPolicyOps {

  implicit def toAccessControlPolicyBuilderOps(v: AccessControlPolicy.Builder): AccessControlPolicyBuilderOps =
    new AccessControlPolicyBuilderOps(v)

  implicit def toAccessControlPolicyOps(v: AccessControlPolicy): AccessControlPolicyOps = new AccessControlPolicyOps(v)

}
