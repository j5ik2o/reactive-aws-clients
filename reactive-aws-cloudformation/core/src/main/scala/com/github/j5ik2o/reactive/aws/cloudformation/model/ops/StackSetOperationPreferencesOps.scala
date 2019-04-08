// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationPreferencesBuilderOps(val self: StackSetOperationPreferences.Builder) extends AnyVal {

  final def regionOrderAsScala(value: Option[Seq[String]]): StackSetOperationPreferences.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regionOrder(v.asJava)
    } // Seq[String]
  }

  final def failureToleranceCountAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
    value.fold(self) { v =>
      self.failureToleranceCount(v)
    }
  } // Int

  final def failureTolerancePercentageAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
    value.fold(self) { v =>
      self.failureTolerancePercentage(v)
    }
  } // Int

  final def maxConcurrentCountAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
    value.fold(self) { v =>
      self.maxConcurrentCount(v)
    }
  } // Int

  final def maxConcurrentPercentageAsScala(value: Option[Int]): StackSetOperationPreferences.Builder = {
    value.fold(self) { v =>
      self.maxConcurrentPercentage(v)
    }
  } // Int

}

final class StackSetOperationPreferencesOps(val self: StackSetOperationPreferences) extends AnyVal {

  final def regionOrderAsScala: Option[Seq[String]] = Option(self.regionOrder).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def failureToleranceCountAsScala: Option[Int] = Option(self.failureToleranceCount) // Int

  final def failureTolerancePercentageAsScala: Option[Int] = Option(self.failureTolerancePercentage) // Int

  final def maxConcurrentCountAsScala: Option[Int] = Option(self.maxConcurrentCount) // Int

  final def maxConcurrentPercentageAsScala: Option[Int] = Option(self.maxConcurrentPercentage) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationPreferencesOps {

  implicit def toStackSetOperationPreferencesBuilderOps(
      v: StackSetOperationPreferences.Builder
  ): StackSetOperationPreferencesBuilderOps = new StackSetOperationPreferencesBuilderOps(v)

  implicit def toStackSetOperationPreferencesOps(v: StackSetOperationPreferences): StackSetOperationPreferencesOps =
    new StackSetOperationPreferencesOps(v)

}
