// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectAclResponseBuilderOps(val self: GetObjectAclResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): GetObjectAclResponse.Builder = {
    value.fold(self) { v => self.owner(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala(value: Option[Seq[Grant]]): GetObjectAclResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grants(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): GetObjectAclResponse.Builder = {
    value.fold(self) { v => self.requestCharged(v) }
  }

}

final class GetObjectAclResponseOps(val self: GetObjectAclResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala: Option[Seq[Grant]] =
    Option(self.grants).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectAclResponseOps {

  implicit def toGetObjectAclResponseBuilderOps(v: GetObjectAclResponse.Builder): GetObjectAclResponseBuilderOps =
    new GetObjectAclResponseBuilderOps(v)

  implicit def toGetObjectAclResponseOps(v: GetObjectAclResponse): GetObjectAclResponseOps =
    new GetObjectAclResponseOps(v)

}
