// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeManagedPrefixListsResponseBuilderOps(val self: DescribeManagedPrefixListsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeManagedPrefixListsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListsAsScala(value: Option[Seq[ManagedPrefixList]]): DescribeManagedPrefixListsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.prefixLists(v.asJava)
    }
  }

}

final class DescribeManagedPrefixListsResponseOps(val self: DescribeManagedPrefixListsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListsAsScala: Option[Seq[ManagedPrefixList]] =
    Option(self.prefixLists).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeManagedPrefixListsResponseOps {

  implicit def toDescribeManagedPrefixListsResponseBuilderOps(
      v: DescribeManagedPrefixListsResponse.Builder
  ): DescribeManagedPrefixListsResponseBuilderOps = new DescribeManagedPrefixListsResponseBuilderOps(v)

  implicit def toDescribeManagedPrefixListsResponseOps(
      v: DescribeManagedPrefixListsResponse
  ): DescribeManagedPrefixListsResponseOps = new DescribeManagedPrefixListsResponseOps(v)

}
