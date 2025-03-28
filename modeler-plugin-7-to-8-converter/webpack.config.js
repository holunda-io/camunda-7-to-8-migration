const path = require('path');

module.exports = {
  mode: 'development',
  entry: './client/ConvertToCamunda8ClientExtensionIndex.js',
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'client.js'
  },
  devtool: 'cheap-module-source-map'
};