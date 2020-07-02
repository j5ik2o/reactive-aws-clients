// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeClustersResponseBuilderOps(val self: DescribeClustersResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClustersResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala(value: Option[Seq[Cluster]]): DescribeClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clusters(v.asJava)
    }
  }

}

final class DescribeClustersResponseOps(val self: DescribeClustersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala: Option[Seq[Cluster]] =
    Option(self.clusters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersResponseOps {

  implicit def toDescribeClustersResponseBuilderOps(
      v: DescribeClustersResponse.Builder
  ): DescribeClustersResponseBuilderOps = new DescribeClustersResponseBuilderOps(v)

  implicit def toDescribeClustersResponseOps(v: DescribeClustersResponse): DescribeClustersResponseOps =
    new DescribeClustersResponseOps(v)

}
