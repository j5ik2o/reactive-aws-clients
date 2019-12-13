// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class NodegroupHealthBuilderOps(val self: NodegroupHealth.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuesAsScala(value: Option[Seq[Issue]]): NodegroupHealth.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.issues(v.asJava)
    }
  }

}

final class NodegroupHealthOps(val self: NodegroupHealth) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuesAsScala: Option[Seq[Issue]] = Option(self.issues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodegroupHealthOps {

  implicit def toNodegroupHealthBuilderOps(v: NodegroupHealth.Builder): NodegroupHealthBuilderOps =
    new NodegroupHealthBuilderOps(v)

  implicit def toNodegroupHealthOps(v: NodegroupHealth): NodegroupHealthOps = new NodegroupHealthOps(v)

}
