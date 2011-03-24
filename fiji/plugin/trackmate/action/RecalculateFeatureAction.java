package fiji.plugin.trackmate.action;

import fiji.plugin.trackmate.Logger;
import fiji.plugin.trackmate.TrackMateModelInterface;

public class RecalculateFeatureAction extends AbstractTMAction {

	@Override
	public void execute(TrackMateModelInterface model) {
		logger.log("Recalculating all features.\n");
		Logger oldLogger = model.getLogger();
		model.setLogger(logger);
		model.computeFeatures();
		model.setLogger(oldLogger);
	}

	@Override
	public String getInfoText() {
		return "<html>" +
			"Calling this action causes the model to recompute all the feautures <br>" +
			"for all the spots retained for tracking. " +
			"<p>" +
			"This can be useful to update the image field of spots loaded from a file." +
			"</html>";
	}
	
	@Override
	public String toString() {
		return "Recompute all features";
	}

}