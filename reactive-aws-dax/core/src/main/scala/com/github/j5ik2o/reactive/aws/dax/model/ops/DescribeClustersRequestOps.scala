// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeClustersRequestBuilderOps(val self: DescribeClustersRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNamesAsScala(value: Option[Seq[String]]): DescribeClustersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clusterNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeClustersRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClustersRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeClustersRequestOps(val self: DescribeClustersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNamesAsScala: Option[Seq[String]] =
    Option(self.clusterNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersRequestOps {

  implicit def toDescribeClustersRequestBuilderOps(
      v: DescribeClustersRequest.Builder
  ): DescribeClustersRequestBuilderOps = new DescribeClustersRequestBuilderOps(v)

  implicit def toDescribeClustersRequestOps(v: DescribeClustersRequest): DescribeClustersRequestOps =
    new DescribeClustersRequestOps(v)

}
