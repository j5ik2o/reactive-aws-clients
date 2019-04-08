// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ExecuteChangeSetRequestBuilderOps(val self: ExecuteChangeSetRequest.Builder) extends AnyVal {

  final def changeSetNameAsScala(value: Option[String]): ExecuteChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): ExecuteChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def clientRequestTokenAsScala(value: Option[String]): ExecuteChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class ExecuteChangeSetRequestOps(val self: ExecuteChangeSetRequest) extends AnyVal {

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExecuteChangeSetRequestOps {

  implicit def toExecuteChangeSetRequestBuilderOps(
      v: ExecuteChangeSetRequest.Builder
  ): ExecuteChangeSetRequestBuilderOps = new ExecuteChangeSetRequestBuilderOps(v)

  implicit def toExecuteChangeSetRequestOps(v: ExecuteChangeSetRequest): ExecuteChangeSetRequestOps =
    new ExecuteChangeSetRequestOps(v)

}
