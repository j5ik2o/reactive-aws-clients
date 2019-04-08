// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricAlarmRequestBuilderOps(val self: PutMetricAlarmRequest.Builder) extends AnyVal {

  final def alarmNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  } // String

  final def alarmDescriptionAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmDescription(v)
    }
  } // String

  final def actionsEnabledAsScala(value: Option[Boolean]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.actionsEnabled(v)
    }
  } // Boolean

  final def okActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.okActions(v.asJava)
    } // Seq[String]
  }

  final def alarmActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmActions(v.asJava)
    } // Seq[String]
  }

  final def insufficientDataActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.insufficientDataActions(v.asJava)
    } // Seq[String]
  }

  final def metricNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  } // String

  final def namespaceAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def statisticAsScala(value: Option[Statistic]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.statistic(v)
    }
  } // Statistic

  final def extendedStatisticAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.extendedStatistic(v)
    }
  } // String

  final def dimensionsAsScala(value: Option[Seq[Dimension]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dimensions(v.asJava)
    } // Seq[Dimension]
  }

  final def periodAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  } // Int

  final def unitAsScala(value: Option[StandardUnit]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  } // StandardUnit

  final def evaluationPeriodsAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluationPeriods(v)
    }
  } // Int

  final def datapointsToAlarmAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.datapointsToAlarm(v)
    }
  } // Int

  final def thresholdAsScala(value: Option[Double]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.threshold(v)
    }
  } // Double

  final def comparisonOperatorAsScala(value: Option[ComparisonOperator]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.comparisonOperator(v)
    }
  } // ComparisonOperator

  final def treatMissingDataAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.treatMissingData(v)
    }
  } // String

  final def evaluateLowSampleCountPercentileAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluateLowSampleCountPercentile(v)
    }
  } // String

  final def metricsAsScala(value: Option[Seq[MetricDataQuery]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.metrics(v.asJava)
    } // Seq[MetricDataQuery]
  }

}

final class PutMetricAlarmRequestOps(val self: PutMetricAlarmRequest) extends AnyVal {

  final def alarmNameAsScala: Option[String] = Option(self.alarmName) // String

  final def alarmDescriptionAsScala: Option[String] = Option(self.alarmDescription) // String

  final def actionsEnabledAsScala: Option[Boolean] = Option(self.actionsEnabled) // Boolean

  final def okActionsAsScala: Option[Seq[String]] = Option(self.okActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def alarmActionsAsScala: Option[Seq[String]] = Option(self.alarmActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def insufficientDataActionsAsScala: Option[Seq[String]] = Option(self.insufficientDataActions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def metricNameAsScala: Option[String] = Option(self.metricName) // String

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def statisticAsScala: Option[Statistic] = Option(self.statistic) // Statistic

  final def extendedStatisticAsScala: Option[String] = Option(self.extendedStatistic) // String

  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Dimension]

  final def periodAsScala: Option[Int] = Option(self.period) // Int

  final def unitAsScala: Option[StandardUnit] = Option(self.unit) // StandardUnit

  final def evaluationPeriodsAsScala: Option[Int] = Option(self.evaluationPeriods) // Int

  final def datapointsToAlarmAsScala: Option[Int] = Option(self.datapointsToAlarm) // Int

  final def thresholdAsScala: Option[Double] = Option(self.threshold) // Double

  final def comparisonOperatorAsScala: Option[ComparisonOperator] =
    Option(self.comparisonOperator) // ComparisonOperator

  final def treatMissingDataAsScala: Option[String] = Option(self.treatMissingData) // String

  final def evaluateLowSampleCountPercentileAsScala: Option[String] =
    Option(self.evaluateLowSampleCountPercentile) // String

  final def metricsAsScala: Option[Seq[MetricDataQuery]] = Option(self.metrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MetricDataQuery]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricAlarmRequestOps {

  implicit def toPutMetricAlarmRequestBuilderOps(v: PutMetricAlarmRequest.Builder): PutMetricAlarmRequestBuilderOps =
    new PutMetricAlarmRequestBuilderOps(v)

  implicit def toPutMetricAlarmRequestOps(v: PutMetricAlarmRequest): PutMetricAlarmRequestOps =
    new PutMetricAlarmRequestOps(v)

}
