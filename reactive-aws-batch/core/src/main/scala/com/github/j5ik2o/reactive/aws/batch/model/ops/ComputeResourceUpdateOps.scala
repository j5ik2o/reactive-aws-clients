// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeResourceUpdateBuilderOps(val self: ComputeResourceUpdate.Builder) extends AnyVal {

  final def minvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.minvCpus(v)
    }
  } // Int

  final def maxvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.maxvCpus(v)
    }
  } // Int

  final def desiredvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.desiredvCpus(v)
    }
  } // Int

}

final class ComputeResourceUpdateOps(val self: ComputeResourceUpdate) extends AnyVal {

  final def minvCpusAsScala: Option[Int] = Option(self.minvCpus) // Int

  final def maxvCpusAsScala: Option[Int] = Option(self.maxvCpus) // Int

  final def desiredvCpusAsScala: Option[Int] = Option(self.desiredvCpus) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeResourceUpdateOps {

  implicit def toComputeResourceUpdateBuilderOps(v: ComputeResourceUpdate.Builder): ComputeResourceUpdateBuilderOps =
    new ComputeResourceUpdateBuilderOps(v)

  implicit def toComputeResourceUpdateOps(v: ComputeResourceUpdate): ComputeResourceUpdateOps =
    new ComputeResourceUpdateOps(v)

}
