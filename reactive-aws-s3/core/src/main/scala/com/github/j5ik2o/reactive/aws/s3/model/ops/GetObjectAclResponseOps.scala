// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectAclResponseBuilderOps(val self: GetObjectAclResponse.Builder) extends AnyVal {

  final def ownerAsScala(value: Option[Owner]): GetObjectAclResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

  final def grantsAsScala(value: Option[Seq[Grant]]): GetObjectAclResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grants(v.asJava)
    } // Seq[Grant]
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): GetObjectAclResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

}

final class GetObjectAclResponseOps(val self: GetObjectAclResponse) extends AnyVal {

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

  final def grantsAsScala: Option[Seq[Grant]] = Option(self.grants).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Grant]

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectAclResponseOps {

  implicit def toGetObjectAclResponseBuilderOps(v: GetObjectAclResponse.Builder): GetObjectAclResponseBuilderOps =
    new GetObjectAclResponseBuilderOps(v)

  implicit def toGetObjectAclResponseOps(v: GetObjectAclResponse): GetObjectAclResponseOps =
    new GetObjectAclResponseOps(v)

}
