// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListClustersResponseBuilderOps(val self: ListClustersResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala(value: Option[Seq[String]]): ListClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clusters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListClustersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListClustersResponseOps(val self: ListClustersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clustersAsScala: Option[Seq[String]] = Option(self.clusters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListClustersResponseOps {

  implicit def toListClustersResponseBuilderOps(v: ListClustersResponse.Builder): ListClustersResponseBuilderOps =
    new ListClustersResponseBuilderOps(v)

  implicit def toListClustersResponseOps(v: ListClustersResponse): ListClustersResponseOps =
    new ListClustersResponseOps(v)

}
