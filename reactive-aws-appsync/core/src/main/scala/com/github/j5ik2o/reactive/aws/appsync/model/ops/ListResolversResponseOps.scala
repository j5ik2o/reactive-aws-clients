// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListResolversResponseBuilderOps(val self: ListResolversResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolversAsScala(value: Option[Seq[Resolver]]): ListResolversResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resolvers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListResolversResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListResolversResponseOps(val self: ListResolversResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolversAsScala: Option[Seq[Resolver]] = Option(self.resolvers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResolversResponseOps {

  implicit def toListResolversResponseBuilderOps(v: ListResolversResponse.Builder): ListResolversResponseBuilderOps =
    new ListResolversResponseBuilderOps(v)

  implicit def toListResolversResponseOps(v: ListResolversResponse): ListResolversResponseOps =
    new ListResolversResponseOps(v)

}
