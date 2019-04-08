// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListClustersResponseBuilderOps(val self: ListClustersResponse.Builder) extends AnyVal {

  final def clusterArnsAsScala(value: Option[Seq[String]]): ListClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clusterArns(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListClustersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListClustersResponseOps(val self: ListClustersResponse) extends AnyVal {

  final def clusterArnsAsScala: Option[Seq[String]] = Option(self.clusterArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListClustersResponseOps {

  implicit def toListClustersResponseBuilderOps(v: ListClustersResponse.Builder): ListClustersResponseBuilderOps =
    new ListClustersResponseBuilderOps(v)

  implicit def toListClustersResponseOps(v: ListClustersResponse): ListClustersResponseOps =
    new ListClustersResponseOps(v)

}
