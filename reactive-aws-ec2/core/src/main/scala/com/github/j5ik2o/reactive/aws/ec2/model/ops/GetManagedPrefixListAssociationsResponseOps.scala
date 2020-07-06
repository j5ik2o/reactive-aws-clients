// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetManagedPrefixListAssociationsResponseBuilderOps(
    val self: GetManagedPrefixListAssociationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAssociationsAsScala(
      value: Option[Seq[PrefixListAssociation]]
  ): GetManagedPrefixListAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.prefixListAssociations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetManagedPrefixListAssociationsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetManagedPrefixListAssociationsResponseOps(val self: GetManagedPrefixListAssociationsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAssociationsAsScala: Option[Seq[PrefixListAssociation]] =
    Option(self.prefixListAssociations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetManagedPrefixListAssociationsResponseOps {

  implicit def toGetManagedPrefixListAssociationsResponseBuilderOps(
      v: GetManagedPrefixListAssociationsResponse.Builder
  ): GetManagedPrefixListAssociationsResponseBuilderOps = new GetManagedPrefixListAssociationsResponseBuilderOps(v)

  implicit def toGetManagedPrefixListAssociationsResponseOps(
      v: GetManagedPrefixListAssociationsResponse
  ): GetManagedPrefixListAssociationsResponseOps = new GetManagedPrefixListAssociationsResponseOps(v)

}
