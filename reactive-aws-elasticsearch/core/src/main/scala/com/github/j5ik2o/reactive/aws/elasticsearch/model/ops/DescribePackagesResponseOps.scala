// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribePackagesResponseBuilderOps(val self: DescribePackagesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsListAsScala(value: Option[Seq[PackageDetails]]): DescribePackagesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.packageDetailsList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribePackagesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribePackagesResponseOps(val self: DescribePackagesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsListAsScala: Option[Seq[PackageDetails]] =
    Option(self.packageDetailsList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePackagesResponseOps {

  implicit def toDescribePackagesResponseBuilderOps(
      v: DescribePackagesResponse.Builder
  ): DescribePackagesResponseBuilderOps = new DescribePackagesResponseBuilderOps(v)

  implicit def toDescribePackagesResponseOps(v: DescribePackagesResponse): DescribePackagesResponseOps =
    new DescribePackagesResponseOps(v)

}
