// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeClustersResponseBuilderOps(val self: DescribeClustersResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala(value: Option[Seq[Cluster]]): DescribeClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clusters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[Failure]]): DescribeClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class DescribeClustersResponseOps(val self: DescribeClustersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala: Option[Seq[Cluster]] =
    Option(self.clusters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[Failure]] =
    Option(self.failures).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersResponseOps {

  implicit def toDescribeClustersResponseBuilderOps(
      v: DescribeClustersResponse.Builder
  ): DescribeClustersResponseBuilderOps = new DescribeClustersResponseBuilderOps(v)

  implicit def toDescribeClustersResponseOps(v: DescribeClustersResponse): DescribeClustersResponseOps =
    new DescribeClustersResponseOps(v)

}
