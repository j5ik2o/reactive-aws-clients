// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateResolverResponseBuilderOps(val self: CreateResolverResponse.Builder) extends AnyVal {

  final def withResolverAsScala(value: Option[Resolver]): CreateResolverResponse.Builder = {
    value.fold(self) { v =>
      self.resolver(v)
    }
  } // Resolver

}

final class CreateResolverResponseOps(val self: CreateResolverResponse) extends AnyVal {

  final def resolverAsScala: Option[Resolver] = Option(self.resolver) // Resolver

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateResolverResponseOps {

  implicit def toCreateResolverResponseBuilderOps(v: CreateResolverResponse.Builder): CreateResolverResponseBuilderOps =
    new CreateResolverResponseBuilderOps(v)

  implicit def toCreateResolverResponseOps(v: CreateResolverResponse): CreateResolverResponseOps =
    new CreateResolverResponseOps(v)

}
