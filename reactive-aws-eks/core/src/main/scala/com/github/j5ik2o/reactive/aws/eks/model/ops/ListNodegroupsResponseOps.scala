// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListNodegroupsResponseBuilderOps(val self: ListNodegroupsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupsAsScala(value: Option[Seq[String]]): ListNodegroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodegroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListNodegroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListNodegroupsResponseOps(val self: ListNodegroupsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupsAsScala: Option[Seq[String]] = Option(self.nodegroups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListNodegroupsResponseOps {

  implicit def toListNodegroupsResponseBuilderOps(v: ListNodegroupsResponse.Builder): ListNodegroupsResponseBuilderOps =
    new ListNodegroupsResponseBuilderOps(v)

  implicit def toListNodegroupsResponseOps(v: ListNodegroupsResponse): ListNodegroupsResponseOps =
    new ListNodegroupsResponseOps(v)

}
