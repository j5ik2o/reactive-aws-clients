// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RepositoryCredentialsBuilderOps(val self: RepositoryCredentials.Builder) extends AnyVal {

  final def credentialsParameterAsScala(value: Option[String]): RepositoryCredentials.Builder = {
    value.fold(self) { v =>
      self.credentialsParameter(v)
    }
  }

}

final class RepositoryCredentialsOps(val self: RepositoryCredentials) extends AnyVal {

  final def credentialsParameterAsScala: Option[String] = Option(self.credentialsParameter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRepositoryCredentialsOps {

  implicit def toRepositoryCredentialsBuilderOps(v: RepositoryCredentials.Builder): RepositoryCredentialsBuilderOps =
    new RepositoryCredentialsBuilderOps(v)

  implicit def toRepositoryCredentialsOps(v: RepositoryCredentials): RepositoryCredentialsOps =
    new RepositoryCredentialsOps(v)

}
